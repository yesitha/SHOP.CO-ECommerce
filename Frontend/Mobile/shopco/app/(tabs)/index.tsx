import { Image, StyleSheet } from 'react-native';

import ParallaxScrollView from '@/components/ParallaxScrollView';
import { ThemedText } from '@/components/ThemedText';
import { ThemedView } from '@/components/ThemedView';

export default function HomeScreen() {
  return (
    <ParallaxScrollView
      headerBackgroundColor={{ light: '#A1CEDC', dark: '#1D3D47' }}
      headerImage={
        <Image
          //source={require('@/assets/images/partial-react-logo.png')}
          
        />
      }>
      <ThemedView >
        <ThemedText type="title">Welcome to ShopCo!</ThemedText>

      </ThemedView>
      <ThemedView >
        <ThemedText type="subtitle">Find your favourite outfit right here ...</ThemedText>

      </ThemedView>

    </ParallaxScrollView>
  );
}

